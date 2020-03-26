### 存包
- given 可用箱子为0 ，when 存包， then 失败，可用箱子为0
- given 可用箱子为1，when 存包，then 打印小票，可用箱子为0
- given 可用箱子为5，when 存包， then 打印小票，可用箱子减1

### 取包
- given 正常小票，when 取包， then 取包成功，小票失效，可用箱子加1
- given 异常小票，when 取包，then 取包失败
