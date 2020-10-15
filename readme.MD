## 使用CXF原始的API完成的服务器端和客户代码样例
#### common模块
存放了客户端和服务器共用的WetherService接口，并使用注解
#### Server端
对接口进行了实现，并进行了发布，地址为：` http://localhost:9001/wether?wsdl`
#### Client端
桩代码生成方式： `wsdl2java -p cxf.pure.client.stub http://localhost:9001/wether?wsdl
`
无桩代码：要引入必须的库和使用共用的WetherService
