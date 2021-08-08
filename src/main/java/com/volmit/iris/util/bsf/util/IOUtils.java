/*
 * Copyright 2004,2004 The Apache Software Foundation.
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

package com.volmit.iris.util.bsf.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;

/**
 * This file is a collection of input/output utilities.
 * 
 * @author   Sanjiva Weerawarana
 * @author   Matthew J. Duftler
 */
public class IOUtils {
  // debug flag - generates debug stuff if true
  static boolean debug = false;

  //////////////////////////////////////////////////////////////////////////

  public static String getStringFromReader (Reader reader) throws IOException {
	BufferedReader bufIn = new BufferedReader(reader);
	StringWriter   swOut = new StringWriter();
	PrintWriter    pwOut = new PrintWriter(swOut);
	String         tempLine;

	while ((tempLine = bufIn.readLine()) != null) {
	  pwOut.println(tempLine);
	}

	pwOut.flush();

	return swOut.toString();
  }
}