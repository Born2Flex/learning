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