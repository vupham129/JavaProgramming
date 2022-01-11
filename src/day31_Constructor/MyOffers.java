package day31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        offer1.setInfo("VA", "Amazon Inc", "SDET", 110000, true, true, true, true);

        Offer offer2 = new Offer();
        offer2.setInfo("CA", "Sony Inc", "QA", 120000, true, false, false, true);

        Offer offer3 = new Offer();
        offer3.setInfo("FL", "Apple Inc", "QE", 125000, true, true, true, false);

        Offer offer4 = new Offer();
        offer4.setInfo("TX", "Capitol One", "SM", 115000, false, false, true, true);

        Offer offer5 = new Offer();
        offer5.setInfo("WA", "Bank Of America", "BA", 130000, true, true, false, true);

        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p -> !p.isFullTime); // remove if the offer is not full time
        System.out.println("fullTimeOffers = " + fullTimeOffers.size());

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p-> !p.location.equals("VA")); // removes the offer is the offer is not from local area
        System.out.println("localOffers = " + localOffers.size());

        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(p ->(p.hasBenefit && !p.hasPTO) || (!p.hasBenefit && !p.hasPTO) ||(!p.hasBenefit && p.hasPTO) );// removes the offers does not have benefit and does not have PTO
        System.out.println("offersWithBenefits = " + offersWithBenefits.size());

        ArrayList<Offer> sdetOffers = new ArrayList<>(Arrays.asList(myOffers));
        sdetOffers.removeIf(p-> !p.jobTitle.equals("SDET")); // remove if the offers are not for SDET
        System.out.println("sdetOffers = " + sdetOffers.size());
        for (Offer sdetOffer : sdetOffers) {
            System.out.println(sdetOffer.companyName + " : " + sdetOffer.salary);
        }

        ArrayList<Offer> offerWith100K = new ArrayList<>(Arrays.asList(myOffers));
        offerWith100K.removeIf(p-> p.salary<100000); // removes if the offer is less than 100K
        System.out.println("offerWith100K = " + offerWith100K.size());


    }
}
/*
  2. Create a class named MyOffers:

            2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
            2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that are not for SDET
            2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary


 */

