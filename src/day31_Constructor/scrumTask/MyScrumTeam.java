package day31_Constructor.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {
        // create 4 testers objects
        Tester tester1 = new Tester("Layan", 11, "QA", 110000 );
        Tester tester2 = new Tester("Ali", 43, "SDET", 142000 );
        Tester tester3 = new Tester("Alex", 44, "SE", 135000 );
        Tester tester4 = new Tester("Lala", 23, "SDET", 115000 );

        Tester[] testers = {tester2, tester3, tester4};

        // create 4 developers objects
        Developers developer1 = new Developers("Olga", 22, "Java Developer", 125000);
        Developers developer2 = new Developers("Aygun", 39, "Java Master", 185000);
        Developers developer3 = new Developers("Tunc", 28, "Software Developer", 135000);
        Developers developer4 = new Developers("Sinem", 13, "Senior Developer", 200000);

        Developers[] developers = {developer2, developer3, developer4};

        // 1 Scrum team object
        ScrumTeam scrum = new ScrumTeam("Nigara", "Huseyin", "Neira", 14);

        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

       scrum.addTesters(testers);
       scrum.addDevelopers(developers);

        System.out.println(scrum);

        System.out.println("---------------------------------");

        for(Tester each : scrum.testersList){
            System.out.println(each.name + " : " + each.salary);
        }

        System.out.println("---------------------------------");

        for (Developers eachDeveloper : scrum.devopsList){
            System.out.println(eachDeveloper.name + " : " + eachDeveloper.salary);
        }

        System.out.println("---------------------------------");
        scrum.removeTester(23);
        scrum.removeDeveloper(22);
        System.out.println(scrum);

    }
}
/*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team

 */