/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * 
 */
package org.smartloli.kafka.eagle.api.sms;

import org.smartloli.kafka.eagle.common.util.SystemConfigUtils;

import com.alibaba.fastjson.JSONObject;

/**
 * Test Sms interface.
 * 
 * @author smartloli.
 *
 *         Created by Mar 27, 2017
 */
public class TestSmsFactory {

	public static void main(String[] args) {
		JSONObject params = new JSONObject();
		params.put("auth_id", 11);
		params.put("auth_token", "cc60b49748b829ef69572a7cd0c75c0c");
		params.put("content", "Test sms.");
		params.put("fbpid", "_c_100003");
		params.put("priority", 3);
		params.put("contact_user", "");
		params.put("time", System.currentTimeMillis());
		SmsService sms = new SmsFactory().create();
		String http = SystemConfigUtils.getProperty("kafka.eagel.sms.url");
		sms.sendSms(http, params);
	}

}