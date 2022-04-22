import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class CustomerService {
    //Chuyển từ json sang mảng
    public void getCustomerArray(){
        Gson gson = new Gson();

        Customer[] arrayCustomers = null;


        try {
            //ĐỌc file
            FileReader reader = new FileReader("customer.json");

            //đưa dữ liệu vào array
            arrayCustomers = gson.fromJson(reader, Customer[].class);

        } catch (FileNotFoundException e) {
            System.out.println("Không tìn thấy file");
        }

        for(Customer c : arrayCustomers){
            System.out.println(c.getId() + " - " + c.getFirstName() + " - " +
                    c.getLastName());
        }
    }

    //Chuyển từ json sang ArrayList
    public void getArrayListCustomer(){
        Gson gson = new Gson();

        ArrayList<Customer> list = new ArrayList<>();

        try {
            FileReader reader = new FileReader("customer.json");

            Type type = new TypeToken<ArrayList<Customer>>(){}.getType();
            list = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            System.out.println("không tìm thấy file");
        }

        for(Customer c : list){
            System.out.println(c.getId() + " - " + c.getFirstName() + " - " + c.getLastName());
        }
    }
}
