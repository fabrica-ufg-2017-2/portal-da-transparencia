FROM node:6.11.3
WORKDIR /workdir
COPY ./front /workdir
RUN npm install 
RUN npm run build:prod

FROM maven:3.5.0-jdk-8-alpine
WORKDIR /workdir
COPY ./back/portal-da-transparencia /workdir
COPY --from=0 /workdir/dist ./src/main/resources/public/
RUN mvn package
