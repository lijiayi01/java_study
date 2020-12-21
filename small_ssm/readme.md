# SSM项目搭建

## mybatis搭建

1. 在resources文件夹下创建mybatis配置文件，比如spring-mybatis.xml。

2. 配置文件详看文件内容

3. 设置mapper与dao关联， 在resources目录创建和dao相同的包，必须保证dao里的接口名和resources目录下mapper对应的xml文件文件名相同。

## 实战

做一个简单的商城系统，包含功能: 前端、后台管理系统、api

前端: 通过ajax的方式交互

api:
    
   - 用户功能：
        登录、注册、修改用户信息、下单、评论
   - 商品:
        商品分类、获取商品(分页)列表、商品详情
      
管理后台：
    
   - 商品类型增删改查
   - 商品增删改查
   - 用户增删改查
   - 评论增删改查