package info.doula.collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Predicate;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 * <p>
 * http://hossaindoula.com
 * <p>
 * https://github.com/hossaindoula
 */
public class CategorisedHelpDeskJava8 {
    private Queue<Enquiry> enquiries = new ArrayDeque<>();

    public boolean enquire(final Customer customer, final Category type) {
        return enquiries.offer(new Enquiry(customer, type));
    }

    public void processPrinterEnquiry() {
        processEnquiry(
            enquiry -> enquiry.getCategory() == Category.PRINTER, "Is it out of paper?");
    }

    public void processGeneralEnquiry() {
        processEnquiry(
            enquiry -> enquiry.getCategory() != Category.PRINTER, "Have you tried turning it off and on again?");
    }

    private void processEnquiry(final Predicate<Enquiry> enquiryCheck, final String message) {
        final Enquiry enquiry = enquiries.peek();
        if (enquiry != null && enquiryCheck.test(enquiry)) {
            enquiries.remove();
            enquiry.getCustomer().reply(message);
        } else {
            System.out.println("No work to do, let's have some coffee!");
        }
    }

    public static void main(String[] args) {
        CategorisedHelpDeskJava8 helpDesk = new CategorisedHelpDeskJava8();

        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, Category.PRINTER);

        helpDesk.processPrinterEnquiry();
        helpDesk.processGeneralEnquiry();
        helpDesk.processPrinterEnquiry();
    }
}
