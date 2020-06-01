**全局异常处理例子**
~~~~1、通过@ControllerAdvice、@ExceptionHandler、@ResponseBody三个注解的组合使用，实现全局异常处理。
2、通过配置spring.mvc.throw-exception-if-no-handler-found=true，控制404异常抛出
3、通过继承ResponseEntityExceptionHandler类，可以利用重写实现404异常的自定义格式返回
4、自定义业务异常和统一的接口返回数据格式，将CommonResp、ResultCode、BusinessException很好的结合使用。
5、404异常导致tomcat版本号泄露问题的解决
6、全局异常处理拦截不到404请求的原因分析