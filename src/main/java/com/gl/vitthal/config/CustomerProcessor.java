/**
 * Created By Vitthal Garad
 * Date:25-12-2024
 * Time:19:31
 * Project Name:batchprocessing
 */


package com.gl.vitthal.config;

import com.gl.vitthal.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {
	@Override
	public Customer process(Customer customer) throws Exception {
		return customer;
	}
}
