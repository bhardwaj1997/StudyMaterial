package OptionalClassPractice;



import java.text.Normalizer;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;


public class OptionalDemo {
    public static void main(String[] args) {


        Customer customer = new Customer(10, "Kuldeep","Kb@gma.com");

        Optional<String> optional = Optional.of(customer.getEmail());
//      System.out.println(optional);

Optional<String> emailOpt = Optional.ofNullable(customer.getEmail());
        System.out.println("email =" + emailOpt.map(obj -> obj.toUpperCase()));
        System.out.println("emailOpt = " + emailOpt.orElse("kuldeep"));
    
    Date  fata= new Date();
    TimeZone tf = TimeZone.getDefault();

//    tf.getID();
        System.out.println("tf = " + tf.getID());


        Set<String> zids = ZoneId.getAvailableZoneIds();

        String[] cityNames = { "Abu Dhabi", "Dubai", "Sydney", "Dakota", "Alabama", "New York", "Chicago" };
        for (String cityName : cityNames) {
            String tzCityName = Normalizer.normalize(cityName, Normalizer.Form.NFKD)
                    .replaceAll("[^\\p{ASCII}-_ ]", "")
                    .replace(' ', '_');
            List<String> possibleTimeZones = zids.stream()
                    .filter(zid -> zid.endsWith("/" + tzCityName))
                    .collect(Collectors.toList());
            System.out.format("%-12s %s%n", cityName, possibleTimeZones);
        }
}
//    DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//// Use Madrid's time zone to format the date in
//    df.setTimeZone(TimeZone.getTimeZone("Europe/Madrid"));

}
