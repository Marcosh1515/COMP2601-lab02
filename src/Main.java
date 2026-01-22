class Main {
    static void main(final String[] args) {
        final IPhone iPhone1 = new IPhone("work", 60, "telus");
        final IPhone iPhone2 = new IPhone("pleasure", 30, "rogers");
        final IPad iPad1 = new IPad("drawing", true, "1");
        final IPad iPad2 = new IPad("videos", false, "2");
        final IPod iPod1 = new IPod("music", 75, 75);
        final IPod iPod2 = new IPod("music", 60, 95);
        final IPhoneSeven iPhoneSeven1 = new IPhoneSeven("call", 45d, "fido",true,45);
        final IPhoneSeven iPhoneSeven2 = new IPhoneSeven("calendar", 35d, "koodo",false,8000);

        System.out.println(iPod1);
        iPod1.printDetails();
    }
}

