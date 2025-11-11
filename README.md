Simple plugin for IntelliJ IDEA that adds macro for live templates with active task id from Task Management plugin

# How to use

- Go to Settings → Editor → Live Templates
- Add a new or edit the existing template:  
  ```
  // TODO: $date$ $task_id$$END$
  ```
- go to Edit Variables and add expression `taskManagementTaskId()` to your placeholder.

Finally, you should see such generated code:

```java
// TODO: 11.11.2025 PROJECT-123 
```

If a task is not selected, it will return `Default` as a result 
```java
// TODO: 11.11.2025 Default
```