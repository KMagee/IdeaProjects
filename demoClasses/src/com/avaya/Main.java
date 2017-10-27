package com.avaya;

public class Main {

    public static void main(String[] args) {
	// make use of the helper class method
    //can only read displayDateTime because it is static, belongs to a class. Non Static only available if it is an instance of a class. Instance --> create a new object from the class
     //capital letter -- Class
     //helper class, probably only going to have one version/instance of it, static is fine. If you are creating many instances e.g. balls, you need lots of instamces non-static. Singleton
     //claaaes in the same package do not have to be imported. utrl.Date needed to be imported as it was not in the package folder

        MyHelper.displayDateTime();

    }
}
