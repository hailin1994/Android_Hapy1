![](https://github.com/hailin1994/learn/tree/master/spring/mvc/img/springMvc流程图.png)

对上述流程图的解释：

- 用户发起请求到前端控制器（Controller）
- 前端控制器没有处理业务逻辑的能力，需要找到具体的模型对象处理（Handler），到处理器映射器（HandlerMapping）中查找Handler对象（Model）。
- HandlerMapping返回执行链，包含了2部分内容： ① Handler对象、② 拦截器数组
- 前端处理器通过处理器适配器包装后执行Handler对象。
- 处理业务逻辑。
- Handler处理完业务逻辑，返回ModelAndView对象，其中view是视图名称，不是真正的视图对象。
- 将ModelAndView返回给前端控制器。
- 视图解析器（ViewResolver）返回真正的视图对象（View）。
- (此时前端控制器中既有视图又有Model对象数据）前端控制器根据模型数据和视图对象，进行视图渲染。
- 返回渲染后的视图（html/json/xml）返回。
- 给用户产生响应。

