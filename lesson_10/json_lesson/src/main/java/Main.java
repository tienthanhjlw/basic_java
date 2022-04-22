import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        String json = "{\"id\":1,\"first_name\":\"Edeline\",\"last_name\":\"Nortunen\",\"email\":\"enortunen0@narod.com\",\"gender\":\"Female\"}";

        Gson gson = new Gson();

        Customer customer = gson.fromJson(json, Customer.class);
        System.out.println(customer);


        //Chuyển từ object sang json
        Customer newCustomer = new Customer(2, "Lục", "Ngọc", "ngoc@techmaster.vn", "Female");

        String jsonCustomer = gson.toJson(newCustomer);
        System.out.println(jsonCustomer);

        CustomerService customerService = new CustomerService();
        customerService.getCustomerArray();
    }
}
