1. Find the Xpath of the **Amazon Title**?
```
<a href="/ref=nav_logo" id="nav-logo-sprites" class="nav-logo-link nav-progressive-attribute" aria-label="Amazon.in" lang="en">
      <span class="nav-sprite nav-logo-base"></span>
      <span id="logo-ext" class="nav-sprite nav-logo-ext nav-progressive-content"></span>
      <span class="nav-logo-locale">.in</span>
</a>
```
Ans: 
- By Attribute - `//a[@id='nav-logo-sprites']`  
- Using contains() - `//a[contains(@class, 'nav-logo-link')]`   
- Using starts-with() - `//a[starts-with(@class,'nav-logo')]`   
- By Text - `//span[text()='.in']`   
- By Multiple Attributes - `//a[@id='nav-logo-sprites' and @aria-label='Amazon.in']`


2. Find the Css of the **Amazon Title**?
Ans: 
- By ID: `#nav-logo-sprites`
- By Class - `a.nav-logo-link.nav-progressive-attribute`
- By Tag and Attribute - `a[aria-label='Amazon.in']`
- By Multiple Attributes - `a[href='/ref=nav_logo'][aria-label='Amazon.in']`
- Parent → Child - `a.nav-logo-link > span.nav-logo-locale`
- Descendant - `a.nav-logo-link > span#logo-ext`
- Starts / Ends / Contains - `a[class^='nav-logo']`   /* starts with */  
`span[class$='logo-locale']`     /* ends with */
`a[href*='nav_logo']`     /* contains */

3. Find the Xpath for **Shopping Item**?
- Partial Text - `//span[contains(text(),'in')]`
- Indexing - `(//input[@type='text'])[2]`
- Axes - `//div[text()='Revamp']/following-sibling::h2`   
`//input[@id='email']/ancestor::form`





