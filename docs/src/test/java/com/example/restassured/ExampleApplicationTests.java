/*
 * Copyright 2014-2016 the original author or authors.
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

package com.example.restassured;

import org.junit.Before;
import org.junit.Rule;
import org.springframework.restdocs.RestDocumentation;

import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.specification.RequestSpecification;

import static org.springframework.restdocs.restassured.RestAssuredRestDocumentation.documentationConfiguration;

public class ExampleApplicationTests {

	@Rule
	public final RestDocumentation restDocumentation = new RestDocumentation(
			"build/generated-snippets");

	// tag::setup[]
	private RequestSpecification spec;

	@Before
	public void setUp() {
		this.spec = new RequestSpecBuilder().addFilter(
				documentationConfiguration(this.restDocumentation)) // <1>
				.build();
	}
	// end::setup[]
}
