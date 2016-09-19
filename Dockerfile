FROM java:8

RUN useradd -s /bin/bash app

RUN mkdir /app && \
    mkdir /app/code
RUN chmod 775 /app/code

COPY ./ /app/code
    
# Create writable log dir
WORKDIR /var/log
RUN mkdir forrent && chmod 775 forrent && chgrp app forrent

# Build jar file
WORKDIR /app/code
RUN build/hooks/pre-deploy



USER app
CMD ["spark-submit", "/app/jar/lead-insights-data-processor-all.jar"]

