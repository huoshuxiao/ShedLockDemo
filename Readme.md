# ShedLock

`ShedLock makes sure that your scheduled tasks are executed at most once at the same time. If a task is being executed on one node, it acquires a lock which prevents execution of the same task from another node (or thread). Please note, that if one task is already being executed on one node, execution on other nodes does not wait, it is simply skipped.`

**ShedLock is not a distributed scheduler**

### Link

[ShedLock](https://github.com/lukas-krecan/ShedLock)