/*
 * Copyright 2011-2017 GatlingCorp (http://gatling.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.gatling.http.funspec

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.funspec.GatlingHttpFunSpecCompileTest._

class GatlingHttpFunSpecCompileTest extends GatlingHttpFunSpec {

  val baseURL = "http://example.com"
  override def httpConf = super.httpConf.header("MyHeader", "MyValue")

  spec {
    http("Index test")
      .get("/index.html")
      .check(h1 exists)
  }

}

object GatlingHttpFunSpecCompileTest {

  def h1 = css("h1")

}
