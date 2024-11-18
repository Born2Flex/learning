# Meaningful Names

## Clarity is a King!

1. **Names Should Reveal Intent**
    - The name of a variable, class, or function should answer the question of why it exists.
    - Code should be implicit, making it easy to read and understand.
    
2. **Avoid Disinformation**
    - Avoid words whose entrenched meaning varies from the intended one.
    - Avoid names that vary in small ways.
    
3. **Make Meaningful Distinctions**
    - Number series naming (e.g., `a1`, `a2`, `a3` ...) is BAD naming.
    - Avoid noise words (unmeaningful names). Noise words are redundant.
    
4. **Use Pronounceable Names**
    
5. **Use Searchable Names**
    - The length of the name should correspond to the size of its scope. Single-letter names can ONLY be used as local variables inside short methods.
    - If a variable or constant is used in multiple places in a body of code, it is imperative to give it a search-friendly name (define a constant).
    
6. **Avoid Preceding 'I' in Interface Names**
    
7. **Avoid Mental Mapping**
    - `i`, `j`, `k` serve for loops (and that's all!). You should use better naming for your variables, not single letters.
    
8. **Classes and Objects Should Have Noun or Noun Phrase Names**
    
9. **Method Names Should Have Verb or Verb Phrase Names**
    
10. **Accessors, Mutators, and Predicates Should Be Named for Their Value and Prefixed with `get`, `set`, and `is`**
    
11. **Don't Use Slang or Local Meanings. Say What You Mean**
    
12. **Use Consistent Lexicon for Code Naming**
    - Always give names in the same way.
    
13. **Add Meaningful Context**
    - Group variables in a class, etc.
    
14. **Don't Add Extra Context**
    - Do not prefix all variables with the project name.
    
15. **Don't Be Afraid to Refactor**

---
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
---
# Comments

## It's Better to Rewrite the Code Than Add an Additional Comment
#### Good Comments

- **Legal Comments**
    - Licenses, etc.
- **Informative Comments**
    - Explains why something was made.
- **Explanation of Intent**
    - Explains why we do something.
- **TODO Comments**
- **JavaDocs for an API**

#### Bad Comments

- **Mumbling Comments**
    - Comments that do not reveal intent.
- **Redundant Comments**
- **Misleading Comments**
- **Position Markers**
- **Closing Brace Comments**
- **Commented-Out Code**

---
# Formatting

1. **Concepts That Are Closely Related Should Be Kept Vertically Close to Each Other**
    
2. **Classes**
    - Variables should be declared at the top of the class.
    
3. **Functions**
    - If one function calls another, they should be close to each other (the caller should be above the callee).
    
4. **Good Line-Length Limit**
    - 120 characters.
    
5. **Consistency**
    - In a group of people, the software should have a consistent style.

---
# Objects and Data Structures

1. **Hiding Implementation**    
    - Hiding implementation is about forming abstractions.
    
2. **Procedural vs. Object-Oriented Code**
    - Procedural code makes it hard to add new structures (new implementations) because all the functions must change.
    - Object-oriented code makes it hard to add new functions because all classes must change.
    
3. **Law of Demeter**
    - A module should not know about the innards of the object it manipulates (hide data, expose operations).

---
# Error Handling

1. **Write `try-catch-finally` Before the Code That Could Throw an Exception**
    
2. **Use Unchecked Exceptions (in most cases)**    
    - Checked exceptions violate the Open-Closed Principle.
    
3. **Provide Good Context with Exceptions**
    - Each exception should provide enough context to determine the source and location of an error.
    
4. **Define Your Own Exception Structure if Needed**
    
5. **Use Wrappers for Third-Party APIs if Needed**
    - Minimize dependencies upon third-party APIs.
    
6. **Define a _Normal_ Flow**
    - Throwing an exception is not always a good idea.
    
7. **Don't Return `null`**
    - Use special values (wrappers).
    
8. **Don't Pass `null` as an Argument**

---
# Unit Tests

1. **Test Driven Development (TDD)**
    
2. **Keep Tests Clean**    
    - Test code is just as important as production code.
    
3. **Tests Are the Road to Refactoring and Changes in Code!**
    
4. **Readability**
    - One of the most important things in tests is _readability_.
    
5. **Patterns in Tests**
    - Build-Operate-Check or Given-When-Then pattern can be used in tests.
    
6. **Performance**
    - Performance is not the first thing to care about in tests.
    
7. **Use Minimum Asserts in Your Tests**
    
8. **Test a Single Concept Per Test**
    

---
## Three Laws of TDD

1. **First Law**
    - You may not write production code until you have a failing test.
2. **Second Law**
    - You may not write more tests than needed to fail (as soon as the tests fail, you're done).
3. **Third Law**
    - You may not write more code than needed to pass failing tests.

---
## F.I.R.S.T

1. **Fast**
    - Tests should be fast.
2. **Independent**
    - Tests should not depend on each other.
3. **Repeatable**
    - Tests should be repeatable in any environment.
4. **Self-Validating**
    - Tests should have boolean output - either they pass or fail.
5. **Timely**
    - Tests should be written in a timely fashion. Unit tests should be written just before the production code (over and over in each iteration).