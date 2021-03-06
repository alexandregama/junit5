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
 * Core configuration options for the JUnit Platform Gradle plugin.
 *
 * @since 5.0
 */
class JUnitPlatformExtension {

	/**
	 * The version of the JUnit Platform to use.
	 *
	 * <p>Defaults to {@code '5.+'}.
	 */
	String platformVersion = '5.+'

	/**
	 * The fully qualified class name of the {@link java.util.logging.LogManager}
	 * to use.
	 *
	 * <p>The JUnit plugin will set the {@code java.util.logging.manager}
	 * system property to this value.
	 */
	String logManager

	/**
	 * The directory for the XML test report files.
	 *
	 * <p>Defaults to {@code "build/test-results/junit-platform"}.
	 */
	File reportsDir

	/**
	 * Whether or not the standard Gradle {@code test} task should be disabled.
	 *
	 * <p>Set this to {@code false} to have the standard {@code test} task enabled
	 * &mdash; for example, to run TestNG tests via the standard {@code test} task.
	 *
	 * <p>Defaults to {@code true}.
	 */
	boolean disableStandardTestTask = true

	/**
	 * A regular expression used to match against test class names.
	 *
	 * <p>If the supplied regular expression does not match against a
	 * particular class name, that class will be filtered out of the test
	 * plan (i.e., excluded).
	 */
	String classNameFilter

	/**
	 * Set the regular expression to be used to match against test class names.
	 *
	 * <p>If the supplied regular expression does not match against a
	 * particular class name, that class will be filtered out of the test
	 * plan (i.e., excluded).
	 */
	void matchClassName(regex) {
		classNameFilter = regex
	}

}
