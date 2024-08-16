gateway
------
gateway 统一对外部服务进行签名验签
gateway 统一对内部服务有权限的接口提供访问，无需访问权限的接口进行拦截
gateway 请求转发到业务服务器
gateway 的认证是通过spring oauth2服务提供jwt认证服务
gateway 统一对内部服务进行限流
gateway 统一对内部服务进行熔断
