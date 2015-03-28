FROM debian:jessie
ENV DEBIAN_FRONTEND noninteractive

RUN  apt-get update -q && \
    apt-get install -qy build-essential wget curl --no-install-recommends && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/* && \
    wget -O - https://storage.googleapis.com/golang/go1.4.2.src.tar.gz --no-check-certificate | tar -v -C /usr/local -xzi && cd /usr/local/go/src && \
    ./make.bash --no-clean 2>&1 && \
    mkdir -p /gopath && \
    apt-get remove -y --purge build-essential


ENV PATH /gopath/bin:/usr/local/go/bin:$PATH
ENV GOPATH /gopath

ADD main/ /gopath/src/main/
ADD restserver/ /gopath/src/restserver/

WORKDIR /gopath/src/main

CMD ["bash"]