/*
 * generated by Xtext 2.23.0
 */
package org.example.myunodsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.example.myunodsl.ui.internal.MyunodslActivator;

public class MyunodslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MyunodslActivator.getInstance().getInjector("org.example.myunodsl.Myunodsl");
	}

}
