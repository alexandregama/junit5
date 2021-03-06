/*
 * Copyright 2015-2016 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.junit.gen5.gradle.plugin

/**
 * Tag configuration options for the JUnit Platform Gradle plugin.
 *
 * @since 5.0
 */
class TagsExtension {

	/**
	 * A list of <em>tags</em> to be included when building the test plan.
	 */
	List<String> include = []

	/**
	 * A list of <em>tags</em> to be excluded when building the test plan.
	 */
	List<String> exclude = []

	/**
	 * Add one or more <em>tags</em> to be included when building the test plan.
	 */
	void include(String... tags) {
		this.include.addAll tags
	}

	/**
	 * Add one or more <em>tags</em> to be excluded when building the test plan.
	 */
	void exclude(String... tags) {
		this.exclude.addAll tags
	}

}
