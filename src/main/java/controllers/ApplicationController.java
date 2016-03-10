/**
 * Copyright (C) 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;

import ninja.Context;
import ninja.Result;
import ninja.Results;

import com.google.inject.Singleton;
import ninja.params.PathParam;


@Singleton
public class ApplicationController {

    public Result Blackjack() {
        return Results.html().template("views/Blackjack/Blackjack.ftl.html");
    }
	
	public Result TheGame() {
        return Results.html().template("views/Blackjack/TheGame.ftl.html");
    }
	
	public Result Money() {
        return Results.html().template("views/Blackjack/Money.html");
    }
	
	public Result index() {
        return Results.html();
    }
	
	public Result header() {
        return Results.html().template("views/layout/header.ftl.html");
    }
	
	public Result footer() {
        return Results.html().template("views/layout/footer.ftl.html");
    }
	
	//public Result audio() {
    //    return Results.html().template("assets/audio/"); add to shortcuts if audio to be added
    //}
    

}
