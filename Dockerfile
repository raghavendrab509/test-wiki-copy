FROM java:8

RUN mkdir /app && \
    mkdir /app/code
RUN chmod 775 /app/code

COPY ./ /app/code

WORKDIR /app/code

ENTRYPOINT ["./build/hooks/deploy"]

