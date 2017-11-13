package art.b.Helpdesk;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Predicate;

public class Helpdesk {
    public final Queue<Enquiry> enquiries = new ArrayDeque<Enquiry>();

    public void enquire(final Customer customer, final Category category) {
        enquiries.offer(new Enquiry(customer, category));

    }

    public void processPrinterEnquiry(){
        final Predicate<Enquiry> predicate = enq -> enq.getCategory() == Category.PRINTER;
        final String msg = "Is it out of paper?";
        // EXTRACTED METHOD
        final Enquiry enquiry = enquiries.peek();
        if (enquiry != null && predicate.test(enquiry)) {
            enquiries.remove();
            enquiry.getCustomer().reply(msg);
        } else {
            enquiry.getCustomer().reply("Nothing to do here, lets drink some coffe");

        }
        // END OF EXTRACTED METHOD
    }

    /*
    Pretty neat, extracted common piece of code to a method and passed differences as a parameters,
    neat and good habit, methods from below and afore are the some

     */
    public void processGeneralEnquiry(){
        processEnquiry(enq -> enq.getCategory() != Category.PRINTER,"Have you tried turning it off and on again?");
    }

    private void processEnquiry(Predicate<Enquiry> predicate, String msg) {
        final Enquiry enquiry = enquiries.peek();
        if (enquiry != null && predicate.test(enquiry)) {
            enquiries.remove();
            enquiry.getCustomer().reply(msg);
        } else {
            enquiry.getCustomer().reply("Nothing to do here, lets drink some coffe");
        }
    }


    public static void main(String... args){
        Helpdesk helpdesk = new Helpdesk();

        helpdesk.enquire(Customer.JACK, Category.PHONE);
        helpdesk.enquire(Customer.JILL, Category.PRINTER);

        helpdesk.processPrinterEnquiry();
        helpdesk.processGeneralEnquiry();
        helpdesk.processPrinterEnquiry();
    }
}
