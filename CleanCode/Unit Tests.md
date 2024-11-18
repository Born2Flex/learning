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