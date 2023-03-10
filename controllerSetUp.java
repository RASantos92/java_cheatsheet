	// importing services option 1
    private static SomeService someServ;

	public HomeController(SomeService someServ) {
		this.someServ = someServ;
	}

    // option 2 is auto wire