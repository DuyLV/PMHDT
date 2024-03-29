/*
 * Copyright 2013-2017 the original author or authors.
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
package shopbanhang.inventory;

import org.salespointframework.core.DataInitializer;
import org.salespointframework.inventory.Inventory;
import org.salespointframework.inventory.InventoryItem;
import org.salespointframework.quantity.Quantity;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import shopbanhang.catalog.DienThoaiCatalog;


@Component
@Order(20)
class InventoryInitializer implements DataInitializer {

	private final Inventory<InventoryItem> inventory;
	private final DienThoaiCatalog dienthoaiCatalog;

	InventoryInitializer(Inventory<InventoryItem> inventory, DienThoaiCatalog dienthoaiCatalog) {

		Assert.notNull(inventory, "Inventory must not be null!");
		Assert.notNull(dienthoaiCatalog, "VideoCatalog must not be null!");

		this.inventory = inventory;
		this.dienthoaiCatalog= dienthoaiCatalog;
	}


	@Override
	public void initialize() {

		

		dienthoaiCatalog.findAll().forEach(dienThoai -> {

			// Try to find an InventoryItem for the project and create a default one with 10 items if none available
			inventory.findByProduct(dienThoai) //
					.orElseGet(() -> inventory.save(new InventoryItem(dienThoai, Quantity.of(10))));
		});
	}
}
