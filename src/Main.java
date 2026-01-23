class Main {
    static void main(final String[] args) {
        final IPod iPod1 = new IPod("music", 75, 75);
        final IPod iPod2 = new IPod("music", 60, 95);
        final IPad iPad1 = new IPad("drawing", true, "1");
        final IPad iPad2 = new IPad("videos", false, "2");
        final IPhone iPhone1 = new IPhone("work", 60, "telus");
        final IPhone iPhone2 = new IPhone("pleasure", 30, "rogers");
        final IPhoneSeven iPhoneSeven1 = new IPhoneSeven("call", 45d, "fido",true,45);
        final IPhoneSeven iPhoneSeven2 = new IPhoneSeven("call", 45d, "koodo",true,8000);

        // printDetails()
        System.out.println("printDetails()\n---------------");
        iPod1.printDetails();
        iPod2.printDetails();
        iPad1.printDetails();
        iPad2.printDetails();
        iPhone1.printDetails();
        iPhone2.printDetails();
        iPhoneSeven1.printDetails();
        iPhoneSeven2.printDetails();

        // equals()
        System.out.println("\nequals()\n---------------");
        System.out.println(iPod1.equals(iPod2));
        System.out.println(iPod2.equals(iPod1));
        System.out.println(iPad1.equals(iPad2));
        System.out.println(iPad2.equals(iPad1));
        System.out.println(iPhone1.equals(iPhone2));
        System.out.println(iPhone2.equals(iPhone1));
        System.out.println(iPhoneSeven1.equals(iPhoneSeven2));
        System.out.println(iPhoneSeven2.equals(iPhoneSeven1));

        // hashCode()
        System.out.println("\nhashCode()\n---------------");
        System.out.println(iPod1.hashCode());
        System.out.println(iPod2.hashCode());
        System.out.println(iPad1.hashCode());
        System.out.println(iPad2.hashCode());
        System.out.println(iPhone1.hashCode());
        System.out.println(iPhone2.hashCode());
        System.out.println(iPhoneSeven1.hashCode());
        System.out.println(iPhoneSeven2.hashCode());
    }
}

