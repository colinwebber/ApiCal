## Micronaut 3.5.4 Documentation

- [User Guide](https://docs.micronaut.io/3.5.4/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.5.4/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.5.4/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

- [Rewrite Gradle Plugin](https://plugins.gradle.org/plugin/org.openrewrite.rewrite)
## Requisites

- [AWS Account](https://aws.amazon.com/free/)
- [CDK CLI](https://docs.aws.amazon.com/cdk/v2/guide/cli.html)
- [AWS CLI](https://aws.amazon.com/cli/)

## How to deploy

### Generate the deployable artifact

```
./gradlew :app:buildNativeLambda
./gradlew test
```

### Deploy

The `infra/cdk.json` file tells the CDK Toolkit how to execute your app.

`cd infra`
`cdk synth` - emits the synthesized CloudFormation template
`cdk deploy` - deploy this stack to your default AWS account/region
`cd ..`

Other useful commands:

`cdk diff` - compare deployed stack with current state
`cdk docs`- open CDK documentation

### Cleanup

```
cd infra
cdk destroy
cd ..
```


- [Shadow Gradle Plugin](https://plugins.gradle.org/plugin/com.github.johnrengelman.shadow)
## Feature aws-secrets-manager documentation

- [Micronaut AWS Secrets Manager documentation](https://micronaut-projects.github.io/micronaut-aws/latest/guide/#distributedconfigurationsecretsmanager)

- [https://aws.amazon.com/secrets-manager/](https://aws.amazon.com/secrets-manager/)


## Feature jms-sqs documentation

- [Micronaut AWS SQS JMS Messaging documentation](https://micronaut-projects.github.io/micronaut-jms/snapshot/guide/index.html)


## Feature aws-lambda documentation

- [Micronaut AWS Lambda Function documentation](https://micronaut-projects.github.io/micronaut-aws/latest/guide/index.html#lambda)


## Feature microstream-rest documentation

- [Micronaut MicroStream REST documentation](https://micronaut-projects.github.io/micronaut-microstream/latest/guide/#rest)

- [https://docs.microstream.one/manual/storage/rest-interface/index.html](https://docs.microstream.one/manual/storage/rest-interface/index.html)


## Feature aws-v2-sdk documentation

- [Micronaut AWS SDK 2.x documentation](https://micronaut-projects.github.io/micronaut-aws/latest/guide/)

- [https://docs.aws.amazon.com/sdk-for-java/v2/developer-guide/welcome.html](https://docs.aws.amazon.com/sdk-for-java/v2/developer-guide/welcome.html)


## Feature microstream documentation

- [Micronaut MicroStream documentation](https://micronaut-projects.github.io/micronaut-microstream/latest/guide)

- [https://microstream.one/](https://microstream.one/)


## Feature aws-alexa documentation

- [Micronaut Alexa Skills documentation](https://micronaut-projects.github.io/micronaut-aws/latest/guide/index.html#alexa)


## Feature micronaut-aot documentation

- [Micronaut AOT documentation](https://micronaut-projects.github.io/micronaut-aot/latest/guide/)


## Feature reactor documentation

- [Micronaut Reactor documentation](https://micronaut-projects.github.io/micronaut-reactor/snapshot/guide/index.html)


## Feature openrewrite documentation

- [https://docs.openrewrite.org/](https://docs.openrewrite.org/)


## Feature aws-cdk documentation

- [https://docs.aws.amazon.com/cdk/v2/guide/home.html](https://docs.aws.amazon.com/cdk/v2/guide/home.html)


## Feature swagger-ui documentation

- [Micronaut Swagger UI documentation](https://micronaut-projects.github.io/micronaut-openapi/latest/guide/index.html)

- [https://swagger.io/tools/swagger-ui/](https://swagger.io/tools/swagger-ui/)


## Feature security-oauth2 documentation

- [Micronaut Security OAuth 2.0 documentation](https://micronaut-projects.github.io/micronaut-security/latest/guide/index.html#oauth)


## Feature hibernate-validator documentation

- [Micronaut Hibernate Validator documentation](https://micronaut-projects.github.io/micronaut-hibernate-validator/latest/guide/index.html)


## Feature openapi documentation

- [Micronaut OpenAPI Support documentation](https://micronaut-projects.github.io/micronaut-openapi/latest/guide/index.html)

- [https://www.openapis.org](https://www.openapis.org)


## Feature spring documentation

- [Micronaut Spring Framework Annotations documentation](https://micronaut-projects.github.io/micronaut-spring/latest/guide/index.html)


## Feature problem-json documentation

- [Micronaut Problem JSON documentation](https://micronaut-projects.github.io/micronaut-problem-json/latest/guide/index.html)


## Feature amazon-api-gateway documentation

- [https://aws.amazon.com/api-gateway/](https://aws.amazon.com/api-gateway/)


## Feature rss documentation

- [Micronaut RSS Feed documentation](https://micronaut-projects.github.io/micronaut-rss/latest/guide/index.html#whatsNew)


## Feature multi-tenancy documentation

- [Micronaut Multitenancy documentation](https://docs.micronaut.io/latest/guide/index.html#multitenancy)


## Feature security documentation

- [Micronaut Security documentation](https://micronaut-projects.github.io/micronaut-security/latest/guide/index.html)


## Feature lombok documentation

- [Micronaut Project Lombok documentation](https://docs.micronaut.io/latest/guide/index.html#lombok)

- [https://projectlombok.org/features/all](https://projectlombok.org/features/all)


## Feature dynamodb documentation

- [Micronaut Amazon DynamoDB documentation](https://micronaut-projects.github.io/micronaut-aws/latest/guide/#dynamodb)

- [https://aws.amazon.com/dynamodb/](https://aws.amazon.com/dynamodb/)


## Feature views-thymeleaf documentation

- [Micronaut Thymeleaf Views documentation](https://micronaut-projects.github.io/micronaut-views/latest/guide/index.html#thymeleaf)

- [https://www.thymeleaf.org/](https://www.thymeleaf.org/)


## Feature email-sendgrid documentation

- [Micronaut Sendgrid Email documentation](https://micronaut-projects.github.io/micronaut-email/latest/guide/index.html#sendgrid)

- [https://docs.sendgrid.com/for-developers](https://docs.sendgrid.com/for-developers)


## Feature jdbc-hikari documentation

- [Micronaut Hikari JDBC Connection Pool documentation](https://micronaut-projects.github.io/micronaut-sql/latest/guide/index.html#jdbc)


## Feature management documentation

- [Micronaut Management documentation](https://docs.micronaut.io/latest/guide/index.html#management)


## Feature aws-parameter-store documentation

- [Micronaut AWS Parameter Store Distributed Configuration documentation](https://micronaut-projects.github.io/micronaut-aws/latest/guide/index.html#parametersStore)

- [https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-parameter-store.html](https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-parameter-store.html)


