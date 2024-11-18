# Functions

## Good Code Can't Be Written on the First Try!

1. **Functions Should Be Small**
    - According to Robert Martin, functions should be a maximum of 20 lines long.
    
2. **Functions Should: DO ONE THING. DO IT WELL. DO IT ONLY.**
    
3. **Sections in Functions**
    - If you have sections in functions (e.g., prepare, init, do...), it could mean the function does not do only one thing.
    
4. **Be Careful with SWITCH Statements**
    - If you have to repeat the same logic multiple times, it would be better to review the project structure and 'bury' the switch into an Abstract Factory class (where it would appear only once).
    
5. **Use Descriptive Method Names**
    
6. **A Long Descriptive Name is Better Than a Long Comment and a Short Name**
    
7. **Be Consistent in Method Names**
    - Use the same phrases, nouns, and verbs.
    
8. **Less Function Arguments = Better Function**
    - Three arguments max.
    
9. **Don't Use Flag Arguments (if possible)**
    
10. **Output Argument**
    - Do not use this strategy when writing functions. It is better to use a member function or restructure the code so that it should do the operation and return the result.
    
11. **Extract Exception Handling into a Separate Function**
    - Functions should do ONE THING, so extract exception handling into a separate function. It should look like:
``
```java
public void delete(Page page) {
	try {
		deletePageAndAllReferences(page);
	} catch(Exception e) {
		logger.info(e.getMessage())
	}
}

private void deletePageAndAllReferences(Page page) {
	deletePage(page);
	registry.deleteReference(page.name);
	configKeys.deleteKey(page.name.makeKey())
}
```

12. **Don't Repeat Yourself**

