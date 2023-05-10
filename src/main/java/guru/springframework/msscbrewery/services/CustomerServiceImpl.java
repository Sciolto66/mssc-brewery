package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by ronlangeveld on 18/04/2023
 */
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
  @Override
  public CustomerDto getCustomerById(UUID customerId) {
    return CustomerDto.builder().id(UUID.randomUUID())
            .customerName("Ron Langeveld")
            .build();
  }

  @Override
  public CustomerDto savedNewCustomer(CustomerDto customerDto) {
    return CustomerDto.builder()
            .id(UUID.randomUUID())
            .build();
  }

  @Override
  public void updateCustomer(UUID customerId, CustomerDto customerDto) {
    // todo impl - would add a real impl to update customer
  }

  @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting a customer...");
    }
}
