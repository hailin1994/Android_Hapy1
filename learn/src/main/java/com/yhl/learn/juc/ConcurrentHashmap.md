ConcurrentHashmap 线程安全 （HashMap）
1.8 之前采用分段锁segment set加锁 get不加锁
1.8 直接采用CAS来操作node节点 当节点长度大于8使用红黑树

List接口的CopyOnWriteArrayList
实现Map接口的ConcurrentHashMap
Queue接口的ConcurrentLinkedQueue

