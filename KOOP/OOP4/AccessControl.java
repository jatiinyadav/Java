package KOOP.OOP4;

public class AccessControl {

    //              Class       Package     Subclass        Subclass               World
    //                                      (Same pkg)      (Diff pkg)      Diff Pkg & not subclass
    // public         Y           Y             Y               Y                   Y
    // protected      Y           Y             Y               Y
    // default        Y           Y             Y
    // private        Y

    // Protected
    // In different package in you can only access protected item by sub class not even,
    // by the parent class.

}
