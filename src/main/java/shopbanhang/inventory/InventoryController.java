/*
 * Copyright 2013-2018 the original author or authors.
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

import org.salespointframework.inventory.Inventory;
import org.salespointframework.inventory.InventoryItem;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import shopbanhang.catalog.DienThoai;

// Straight forward?

@Controller
class InventoryController {

	private final Inventory<InventoryItem> inventory;

	InventoryController(Inventory<InventoryItem> inventory) {
		this.inventory = inventory;
	}

	
	@GetMapping("/stock")
	@PreAuthorize("hasRole('BOSS')")
	String stock(Model model) {

		model.addAttribute("stock", inventory.findAll());

		return "stock";
	}
}
