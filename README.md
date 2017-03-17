
# Java Event-Planner

#### 17 March, 2017, v.1.0.0

#### By Mark Fisher

## Description

A java app that allows a user to input a few details about their event and then generates a price estimate for the event. Allows user to apply coupon codes for discounts.

#### Prices:
|Service|Unit|Price/Unit|
|-|-|-|
|Venue  (Ave. 5 hr.)|Guest|$25|
|Food-buffet-Vegetarian|Guest|$12|
|Food-buffet-Meat|Guest|$15|
|Food-plated-Meat|Guest|$25|
|Food-plated-Vegetarian|Guest|$18|
|Food-plated-Fish|Guest|$26|
|Entertainment-DJ|Event  (Ave. 5 hr.)|$400|
|Entertainment-Live Band|Event (Ave. 5 hr.)|$900|
|Entertainment-Photo Booth|Event (Ave. 5 hr.)|$700|
|Beverages-Open Bar|Guest|$40|
|Beverages-Pay Bar|Event  (Ave. 5 hr.) (Guests incur per drink cost)|$30 * 5 hr. = $150|
|Beverages-Non-alcoholic| Event (Ave. 5 hr.)|$20 * 5 hr. = $100|

### Specifications

|Behavior|Input|Output|
|:---:|:---:|:---:|
|A price is returned depending on the number of guests attending|70 guests|$1,750|
|A price is returned depending on what food is being served to each guest, assuming each guest gets the same thing|Buffet-style with meat for 30 guests|$450|
|A price is returned depending on the type of entertainment selected|Live Band|900|
|A price is returned depending on the type of beverage service selected|Non-alcoholic|$100|
|Total cost of event is calculated|70 guests venue + 70 guests buffet-style with meat + Live Band + Non-alcoholic bar|$1750 + $1050 + $900 + $100 = $3800|
|Coupon code is recognized as valid|ABC123|Invalid|
|A valid coupon code applies a discount to the price|10% discount to event|$3800 * 0.9 = $3420|

#### Bonus Specifications

|Behavior|Input|Output|
|:---:|:---:|:---:|
|A price is returned depending on what food is being served to each guest, with the number of guests getting various selections tracked|Buffet-style with meat for 30 guests + Buffet-style with veggies for 15 guest|$450 + $180 = $630|


## Setup/Installation Requirements

* This repository is meant to be viewed. It can be viewed [here](https://Atticus29.github.io/event-planner).

### Or if you're feeling bold, you can clone OR download a local instance of the site:

* Clone
  * Open your terminal program
    * On a Mac, this would be in the Applications/Utilities directory, and is called, "Terminal"
    * Windows uses a Terminal program as well, but a Terminal with all the capabilities we'll require is not installed by default. Thankfully, we can easily download and install a Terminal program that does fit our needs.
There are many options available, but we recommend using a terminal program called git bash. You can download this free program at [msysgit.github.io](https://git-for-windows.github.io/).
  * Clone this track survey repository by typing, `git clone https://github.com/Atticus29/event-planner.git`
* Download
  * Click [here](https://github.com/Atticus29/event-planner/archive/master.zip) to download the repo
  * Unzip the zipped repository
* Open the event-planner folder and double-click on index.html.
* Make your selections and click submit as instructed on the site.


## Known Bugs

There are currently no known bugs.

## Support and contact details

Please feel free to contact mark.aaron.fisher@gmail.com for questions

## Technologies Used

* git v. 2.11.1
* java v. 1.8.0_121
* gradle v. 3.4.1

### License

This software is licensed under the MIT license.

Copyright (c) 2017 Mark Fisher

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
