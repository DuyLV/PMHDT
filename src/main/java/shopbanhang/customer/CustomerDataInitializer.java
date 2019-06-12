/*
q * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package shopbanhang.customer;

import java.util.Arrays;

import org.salespointframework.core.DataInitializer;
import org.salespointframework.useraccount.Role;
import org.salespointframework.useraccount.UserAccount;
import org.salespointframework.useraccount.UserAccountManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;


@Component
@Order(10)
class CustomerDataInitializer implements DataInitializer {

	private static final Logger LOG = LoggerFactory.getLogger(CustomerDataInitializer.class);

	private final UserAccountManager userAccountManager;
	private final CustomerRepository customerRepository;

	/**
	 * Creates a new {@link CustomerDataInitializer} with the given {@link UserAccountManager} and
	 * {@link CustomerRepository}.
	 *
	 * @param userAccountManager must not be {@literal null}.
	 * @param customerRepository must not be {@literal null}.
	 */
	CustomerDataInitializer(UserAccountManager userAccountManager, CustomerRepository customerRepository) {

		Assert.notNull(customerRepository, "CustomerRepository must not be null!");
		Assert.notNull(userAccountManager, "UserAccountManager must not be null!");

		this.userAccountManager = userAccountManager;
		this.customerRepository = customerRepository;
	}

	
	@Override
	public void initialize() {

		
		if (userAccountManager.findByUsername("boss").isPresent()) {
			return;
		}

		LOG.info("Creating default users and customers.");

		UserAccount bossAccount = userAccountManager.create("boss", "123", Role.of("ROLE_BOSS"));
		userAccountManager.save(bossAccount);

		Role customerRole = Role.of("ROLE_CUSTOMER");

		UserAccount ua1 = userAccountManager.create("huynhanh", "123", customerRole);
		UserAccount ua2 = userAccountManager.create("huynhanh1", "123", customerRole);
		UserAccount ua3 = userAccountManager.create("huynhanh2", "123", customerRole);
		UserAccount ua4 = userAccountManager.create("huynhanh3", "123", customerRole);

		Customer c1 = new Customer(ua1, "wurst");
		Customer c2 = new Customer(ua2, "Miami-Dade County");
		Customer c3 = new Customer(ua3, "Camden County - Motel");
		Customer c4 = new Customer(ua4, "Los Angeles");

		customerRepository.saveAll(Arrays.asList(c1, c2, c3, c4));
	}
}
