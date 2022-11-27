package StreamFunctions;

import java.util.HashMap;
import java.util.Map;

public class Test {
  public static void main(String[] args) {

    String grn= "f";
    System.out.println("grn.substring(0).toUpperCase() = " + grn.substring(0,1).toUpperCase());
//    System.out.println(getUtcOffSetValue("-4".trim()));
//    System.out.println(getUtcOffSetValue("-5".trim()));
//    System.out.println(getUtcOffSetValue("-6".trim()));
//    System.out.println(getUtcOffSetValue("-7".trim()));
//    System.out.println(getUtcOffSetValue("-8".trim()));
//    System.out.println(getUtcOffSetValue("-9".trim()));
//    System.out.println(getUtcOffSetValue("-10".trim()));
//    System.out.println(getUtcOffSetValue("-111".trim()));
//    System.out.println(getUtcOffSetValue("-14f".trim()));
  }

  private static String getUtcOffSetValue(String trim) {
    Map<String, String> utcOffsetMap = new HashMap<>();
    utcOffsetMap.put("-4", "MFOUR");
    utcOffsetMap.put("-5", "MFIVE");
    utcOffsetMap.put("-6", "MSIX");
    utcOffsetMap.put("-7", "MSEVEN");
    utcOffsetMap.put("-8", "MEIGHT");
    utcOffsetMap.put("-9", "MNINE");
    utcOffsetMap.put("-10", "MTEN");
    return utcOffsetMap.getOrDefault(trim, "MFOUR");
    //    switch (trim) {
    //      case "-4":
    //        return "MFOUR";
    //        break;
    //      case "-5":
    //        return "MFIVE";
    //        break;
    //      case "-6":
    //        return "MSIX";
    //        break;
    //      case "-7":
    //        return "MSEVEN";
    //        break;
    //      case "-8":
    //        return "MEIGHT";
    //        break;
    //      case "-9":
    //        return "MNINE";
    //        break;
    //      case "-10":
    //        return "MTEN";
    //        break;
    //      default:
    //        return "MFOUR";
  }
}
