### 存包
- given 可用箱子为0（已满） ，when 存包， then 失败
- given 可用箱子大于0（未满），when 存包，then 获取到ticket

### 取包
- given 正常小票，when 取包， then 取包成功
- given 异常小票，when 取包，then 取包失败
- given 已使用的小票， when 取包， then 取包失败
