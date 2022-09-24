package com.sda.javaoop.oop;

public class Main {


    public static void main(String[] args) {
        logObjectCreationStart("employeeAddress1");
        Address employeeAddress1 = new Address();
        employeeAddress1.setCity("Rzeszow");
        employeeAddress1.setStreet("Warszawska");
        employeeAddress1.setPostcode("35-201");
        logObjectCreationEnd("employeeAddress1");

        logObjectCreationStart("employeeAddress2");
        Address employeeAddress2 = new Address();
        employeeAddress2.setCity("Wrocław");
        employeeAddress2.setStreet("Sucha");
        employeeAddress2.setPostcode("35-321");
        logObjectCreationEnd("employeeAddress2");

        logObjectCreationStart("companyAddress1");
        Address companyAddress1 = new Address("Warszawa", "Powstańców", "01-123");
        System.out.println(companyAddress1);
        logObjectCreationEnd("companyAddress1");

        logObjectCreationStart("companyAddress2");
        Address companyAddress2 = new Address("Gdańsk", "Wolności", "43-523");
        System.out.println(companyAddress2);
        logObjectCreationEnd("companyAddress2");


        logObjectCreationStart("javaDeveloper");
        Employee javaDeveloper = new Developer(1, "Bob", "Smith",
                "90120510321", employeeAddress1, Department.IT);
        System.out.println(javaDeveloper);
        javaDeveloper.setName("John");
        javaDeveloper.getSurname();
        javaDeveloper.printEmployeeRole();
        logObjectCreationEnd("javaDeveloper");

        logObjectCreationStart("teamLeader");
        Employee teamLeader = new TeamLeader(1, "Kate", "Smith",
                "90102311445", employeeAddress2, Department.SALES);
        teamLeader.setSurname("Doe");
        teamLeader.getPesel();
        teamLeader.printEmployeeRole();
        logObjectCreationEnd("teamLeader");


        logObjectCreationStart("company1");
        Company company1 = new Company(1, "SDA Academy", companyAddress1);
        System.out.println(company1);
        logObjectCreationEnd("company1");


        logObjectCreationStart("company2");
        Company company2 = new Company(2, "Janusz Soft", companyAddress2);
        System.out.println(company2);
        logObjectCreationEnd("company2");

        System.out.println("\n=> Adding employees to company1 start...");
        System.out.println("========================================================================");
        company1.addEmployee(javaDeveloper);
        System.out.println("========================================================================");
        System.out.println("=> Adding employees to company1 end.\n");

        System.out.println("\n=> Adding employees to company2 start...");
        System.out.println("========================================================================");
        company2.addEmployee(teamLeader);
        System.out.println("========================================================================");
        System.out.println("=> Adding employees to company2 end.\n");

        System.out.println("========================================================================");
        System.out.println("OBJECT EQUALITY CHECKS.\n");

        System.out.println("Equals result: " + employeeAddress1.equals(employeeAddress2));
        System.out.println("========================================================================\n");
        System.out.println("Equals result: " + employeeAddress1.equals(companyAddress2));
        System.out.println("========================================================================\n");
        System.out.println("Equals result: " + employeeAddress2.equals(javaDeveloper));
        System.out.println("========================================================================\n");
        System.out.println("Equals result: " + companyAddress1.equals(companyAddress1));
        System.out.println("========================================================================\n");
        System.out.println("Equals result: " + companyAddress1.equals(companyAddress2));
        System.out.println("========================================================================\n");
        System.out.println("Equals result: " + javaDeveloper.equals(teamLeader));
        System.out.println("========================================================================\n");


        Address javaDeveloperAddress = new Address("Warszawska","Rzeszow", "35-201");

        Employee javaDeveloper2 = new Developer(1, "John", "Smith",
                "90120510321", javaDeveloperAddress, Department.IT);

        System.out.println("Equals result: " + javaDeveloper.equals(javaDeveloper2));
        System.out.println("========================================================================\n");
    }


    private static void logObjectCreationStart(String objName) {
        System.out.printf("\n=> %s object creation started...\n", objName);
        System.out.println("========================================================================");
    }

    private static void logObjectCreationEnd(String objName) {
        System.out.println("========================================================================");
        System.out.printf("=> %s object creation ended.\n\n", objName);
    }

    private static void printEmployee(Employee employee3) {
        System.out.println(employee3);
    }

    private static void printDepartmentEnumExample() {
        int administrationDepartmentId = Department.ADMINISTRATION.getDepartmentId();
        int hrDepartmentId = Department.HR.getDepartmentId();
        int itDepartmentId = Department.IT.getDepartmentId();
        int salesDepartmentId = Department.SALES.getDepartmentId();

        System.out.println(administrationDepartmentId);
        System.out.println(hrDepartmentId);
        System.out.println(itDepartmentId);
        System.out.println(salesDepartmentId);

        System.out.println("================================");

        Department administrationDepartment = Department.values()[5];
        System.out.println(administrationDepartment.name());

        System.out.println("================================");

        Department[] values = Department.values();
        for (Department department : values) {
            System.out.println(department);
        }

        System.out.println("================================");

        Department departmentIT = Department.valueOf("IT");
        Department departmentHR = Department.valueOf("HR");
        System.out.println("Department.valueOf(\"IT\") = " + departmentIT);
        System.out.println("Department.valueOf(\"HR\") = " + departmentHR);

        System.out.println("================================");

//        Throws IllegalArgumentException exception
//        Department.valueOf("ITaasdsad");

        System.out.println(Department.ADMINISTRATION.name());
    }


////        If class is abstract this will produce compilation error
////        Employee employee = new Employee()


////        Anonymous class example:
////        Employee employee = new Employee() {
////            @Override
////            public boolean doWork() {
////                return false;
////            }
////
////            @Override
////            public void printEmployeeRole() {
////
////            }
////        };
}
