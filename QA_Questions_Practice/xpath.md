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
- Using contains() - `//a[contains(@class, 'nav-logo-link nav-progressive-attribute')]`   
- Using starts-with() - `//a[starts-with(@class,'nav-logo')]`   
- By Text - `//span[text()='.in']`   
- By Multiple Attributes - 
- Partial Text - //a[contains(text(),'Login')]
- Indexing - (//input[@type='text'])[2]
- Axes - `//label[text()='Email']/following-sibling::input`   
`//input[@id='email']/ancestor::form`


2. Find the Css of the **Amazon Title**?
Ans: 
- By ID: `#nav-logo-sprites`
- By Class - 
- By Tag and Attribute - `input[name='email']`
- By Multiple Attributes - `input[type='text'][placeholder='Enter Name']`
- Parent → Child - `div.form-group > input`
- Descendant - `div.form-group input`
- Starts / Ends / Contains - `input[id^='user']`   /* starts with */  
`input[id$='name']`     /* ends with */
`input[id*='login']`     /* contains */





