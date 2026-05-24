# 后端技术栈学习计划

> 仓库：https://github.com/dwanda/backend-learning
> 学习者：dwanda
> 目标：系统掌握企业级后端技术栈，达到独立开发微服务架构应用的能力

## 技术栈总览

| 领域 | 技术 | 难度 | 应用场景 |
|------|------|------|----------|
| 语言基础 | Java 21 | ⭐⭐⭐ | 所有后端开发的基础 |
| 构建工具 | Maven | ⭐⭐ | 项目构建、依赖管理 |
| 框架核心 | Spring Boot 3.4 | ⭐⭐⭐ | 快速构建独立应用 |
| 数据存储 | MySQL 8.0 | ⭐⭐⭐ | 核心业务数据持久化 |
| 缓存 | Redis 6.x | ⭐⭐⭐ | 缓存 / 会话 / 分布式锁 |
| 微服务 | Spring Cloud | ⭐⭐⭐⭐ | 微服务治理 |
| 阿里生态 | Spring Cloud Alibaba | ⭐⭐⭐⭐ | 阿里云微服务 |
| 注册配置 | Nacos 2.0 | ⭐⭐⭐ | 服务注册发现 + 配置中心 |
| 消息队列 | RabbitMQ | ⭐⭐⭐ | 异步消息、事件驱动 |
| 搜索引擎 | Elasticsearch 8.x | ⭐⭐⭐⭐ | 全文检索、日志分析 |
| 对象存储 | FDS | ⭐⭐⭐ | 文件/文档/报告存储 |
| 流式处理 | Talos | ⭐⭐⭐⭐ | 流式数据处理 |
| 设计思想 | DDD（领域驱动设计） | ⭐⭐⭐⭐⭐ | 复杂业务建模 |

---

## 学习路线图

### Phase 1：Java 21 + Maven（基础夯实）
**预计耗时：2-3 周**

- [ ] Java 21 新特性：Record、Sealed Class、Pattern Matching、Virtual Threads
- [ ] 函数式编程：Lambda、Stream API、Optional
- [ ] 并发编程：线程池、CompletableFuture、Virtual Threads
- [ ] Maven 核心：POM、生命周期、依赖管理、多模块构建
- [ ] 项目实战：用 Maven 构建一个 Java 21 多模块项目

**产出：**
- code/java-basics/ — Java 21 特性演示代码
- code/maven-demo/ — Maven 多模块示例
- notes/java-21-notes.md — Java 21 知识点总结

---

### Phase 2：MySQL 8.0 + Redis 6.x（数据层）
**预计耗时：3-4 周**

- [ ] MySQL 进阶：索引优化、SQL 执行计划、事务隔离级别、MVCC
- [ ] MySQL 实战：表设计、分库分表策略、慢查询优化
- [ ] Redis 核心：5 种基本数据类型、持久化、过期策略
- [ ] Redis 高级：分布式锁、Redisson、缓存穿透/击穿/雪崩
- [ ] 教学 HTML：Redis 缓存策略可视化图解

**产出：**
- notes/mysql-notes.md — MySQL 知识点总结
- notes/redis-notes.md — Redis 知识点总结
- teaching/redis-cache-strategies.html — 缓存策略教学 HTML
- teaching/mysql-index-explainer.html — 索引优化教学 HTML

---

### Phase 3：Spring Boot 3.4（框架核心）
**预计耗时：3-4 周**

- [ ] Spring 核心：IoC 容器、AOP、Bean 生命周期
- [ ] Spring Boot 自动配置、起步依赖、Actuator
- [ ] Spring Data JPA / MyBatis-Plus 集成
- [ ] 统一异常处理、参数校验、日志框架
- [ ] 单元测试与集成测试（JUnit 5 + Mockito）
- [ ] 项目实战：构建一个 RESTful CRUD API

**产出：**
- code/spring-boot-demo/ — Spring Boot 实战项目
- notes/spring-boot-notes.md — Spring Boot 知识点总结
- teaching/spring-boot-architecture.html — 架构图解

---

### Phase 4：Nacos + Spring Cloud（微服务入门）
**预计耗时：3-4 周**

- [ ] Nacos 搭建：单机与集群部署
- [ ] 服务注册与发现：Nacos Discovery
- [ ] 配置中心：Nacos Config、动态刷新
- [ ] Spring Cloud Gateway：路由、断言、过滤器
- [ ] OpenFeign：声明式服务调用
- [ ] Sentinel：流量控制、熔断降级

**产出：**
- code/spring-cloud-demo/ — 微服务示例项目（多模块）
- notes/nacos-notes.md — Nacos 知识点总结
- notes/spring-cloud-notes.md — Spring Cloud 知识点总结
- teaching/microservice-architecture.html — 微服务架构图解

---

### Phase 5：Spring Cloud Alibaba（阿里生态集成）
**预计耗时：2-3 周**

- [ ] Spring Cloud Alibaba 生态全景
- [ ] Seata：分布式事务管理
- [ ] RocketMQ / 与 RabbitMQ 对比
- [ ] Alibaba Cloud 服务集成
- [ ] 整合 Nacos + Sentinel + Gateway + Feign

**产出：**
- code/alibaba-demo/ — 阿里微服务全套整合
- notes/cloud-alibaba-notes.md — 知识点总结

---

### Phase 6：RabbitMQ（消息驱动）
**预计耗时：2-3 周**

- [ ] RabbitMQ 核心：Exchange、Queue、Binding、Routing Key
- [ ] 消息模式：Direct / Topic / Fanout / Headers
- [ ] 可靠性：生产者确认、消费者确认、死信队列
- [ ] Spring Boot 集成 RabbitMQ
- [ ] 实战场景：订单异步处理、消息补偿

**产出：**
- code/rabbitmq-demo/ — RabbitMQ 集成示例
- notes/rabbitmq-notes.md — 知识点总结
- teaching/rabbitmq-messaging.html — 消息队列教学 HTML

---

### Phase 7：Elasticsearch 8.x（搜索与分析）
**预计耗时：3-4 周**

- [ ] ES 核心概念：索引、分片、映射、分词
- [ ] DSL 查询：全文检索、聚合分析
- [ ] ES 集群架构与调优
- [ ] Spring Data Elasticsearch 集成
- [ ] Elasticsearch + Kibana + Logstash（ELK）
- [ ] 实战场景：日志分析、商品搜索

**产出：**
- code/es-demo/ — ES 集成与查询示例
- notes/elasticsearch-notes.md — 知识点总结
- teaching/elasticsearch-search.html — 搜索引擎教学 HTML

---

### Phase 8：DDD 领域驱动设计（思想进阶）
**预计耗时：3-4 周**

- [ ] DDD 核心概念：实体、值对象、聚合、领域事件
- [ ] 战略设计：限界上下文、上下文映射
- [ ] 战术设计：Repository、Factory、Domain Service
- [ ] DDD + Spring Boot 实战落地
- [ ] 微服务划分与 DDD 的结合

**产出：**
- code/ddd-demo/ — DDD 实战示例
- notes/ddd-notes.md — 知识点总结
- teaching/ddd-modeling.html — DDD 建模教学 HTML

---

### Phase 9：FDS 文件存储
**预计耗时：1-2 周**

- [ ] 对象存储概念与设计
- [ ] FDS SDK 接入
- [ ] 文件上传/下载/分片
- [ ] 权限管理与访问控制
- [ ] 与 Spring Boot 集成

**产出：**
- code/fds-demo/ — FDS 集成示例
- notes/fds-notes.md — 知识点总结

---

### Phase 10：Talos 流式数据处理
**预计耗时：2-3 周**

- [ ] 流处理核心概念：Source、Sink、Transform
- [ ] Talos SDK 接入
- [ ] 实时数据处理 Pipeline
- [ ] 与消息队列结合的场景

**产出：**
- code/talos-demo/ — Talos 集成示例
- notes/talos-notes.md — 知识点总结

---

## 仓库目录结构

```
backend-learning/
├── README.md                   # 仓库总览
├── learning-plan/
│   └── plan.md                 # 学习计划（本文件）
├── notes/                      # 知识点总结（Markdown）
│   ├── java-21-notes.md
│   ├── mysql-notes.md
│   ├── redis-notes.md
│   ├── spring-boot-notes.md
│   ├── nacos-notes.md
│   ├── spring-cloud-notes.md
│   ├── cloud-alibaba-notes.md
│   ├── rabbitmq-notes.md
│   ├── elasticsearch-notes.md
│   ├── ddd-notes.md
│   ├── fds-notes.md
│   └── talos-notes.md
├── code/                       # 代码实战（按技术分目录）
│   ├── java-basics/
│   ├── maven-demo/
│   ├── spring-boot-demo/
│   ├── spring-cloud-demo/
│   ├── alibaba-demo/
│   ├── rabbitmq-demo/
│   ├── es-demo/
│   ├── ddd-demo/
│   ├── fds-demo/
│   └── talos-demo/
└── teaching/                   # 教学 HTML 文档
    ├── redis-cache-strategies.html
    ├── mysql-index-explainer.html
    ├── spring-boot-architecture.html
    ├── microservice-architecture.html
    ├── rabbitmq-messaging.html
    ├── elasticsearch-search.html
    └── ddd-modeling.html
```

## 学习建议

1. **循序渐进**：按 Phase 顺序学习，前面的知识是后续的基础
2. **动手实践**：每个模块学完都要写代码，代码存放在 `code/` 目录
3. **输出倒逼输入**：写知识点总结（notes/）和教学文档（teaching/），能教别人才算真正学会
4. **Git 记录成长**：每次学习都有 commit 记录，形成完整的学习轨迹
5. **遇到问题**：先尝试自己解决（查官方文档、StackOverflow），再记入知识点
6. **不要追求完美**：不需要一次把所有内容学完，按节奏推进即可

## 总预计耗时

| 阶段 | 内容 | 预计时长 |
|------|------|----------|
| Phase 1 | Java 21 + Maven | 2-3 周 |
| Phase 2 | MySQL + Redis | 3-4 周 |
| Phase 3 | Spring Boot | 3-4 周 |
| Phase 4 | Nacos + Spring Cloud | 3-4 周 |
| Phase 5 | Spring Cloud Alibaba | 2-3 周 |
| Phase 6 | RabbitMQ | 2-3 周 |
| Phase 7 | Elasticsearch 8.x | 3-4 周 |
| Phase 8 | DDD | 3-4 周 |
| Phase 9 | FDS | 1-2 周 |
| Phase 10 | Talos | 2-3 周 |
| **合计** | **全部完成** | **约 24-34 周（6-8 个月）** |
