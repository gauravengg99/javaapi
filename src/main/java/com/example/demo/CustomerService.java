package com.example.demo;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CustomerService {

public List<CustomerMachine> getCustomers() {
         
         ObjectMapper mapper = new ObjectMapper();
         List<CustomerMachine> list = new ArrayList<>();
         List<Customer> customer = new ArrayList<>();
         try{
            InputStream inputStream = getClass()
                    .getResourceAsStream("/static/customerData.json");
             customer = mapper.readValue(inputStream, new TypeReference<List<Customer>>(){});
         for (Customer customerList : customer){
              
                    list.add(new CustomerMachine(
                            customerList.getName(),
                            customerList.getMachineModel(),
                            customerList.getLatitude(),
                            customerList.getLongitude(),
                            customerList.getLocation()
                    ));

                }
            // return list;
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return list;
    }
}
