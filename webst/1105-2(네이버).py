# import os
# import sys
# import urllib.request
# import json
# client_id = "7CAC11uBnXpcEgjr8qR7"
# client_secret = "vosC6CrO49"
# encText = urllib.parse.quote("json")
# url = "https://openapi.naver.com/v1/search/blog?query=" + encText # json 결과
# # url = "https://openapi.naver.com/v1/search/blog.xml?query=" + encText # xml 결과
# request = urllib.request.Request(url)
# request.add_header("X-Naver-Client-Id",client_id)
# request.add_header("X-Naver-Client-Secret",client_secret)
# response = urllib.request.urlopen(request)
# rescode = response.getcode()
# if(rescode==200):
#     response_body = response.read()
#     result=(response_body.decode('utf-8'))
#
#
# else:
#     print("Error Code:" + rescode)
#
# d1=json.loads(result)
# print(d1)
# print(type(d1))
# print(d1["items"])      # 배열[ {},{},...{}]
# for doc in d1["items"]:     #doc= {},{},{}...
#     print(doc["title"])
#     print(doc["link"])
#     print(doc["description"])
#     print("-"*30)



import os
import sys
import urllib.request
import json
client_id = "xqsh8LtDECfIs8TqgzxY"
client_secret = "xKKuJOAsp8"
encText = urllib.parse.quote("오늘은 금요일입니다. 삐빅")
data = "source=ko&target=en&text=" + encText
url = "https://openapi.naver.com/v1/papago/n2mt"
request = urllib.request.Request(url)
request.add_header("X-Naver-Client-Id",client_id)
request.add_header("X-Naver-Client-Secret",client_secret)
response = urllib.request.urlopen(request, data=data.encode("utf-8"))
rescode = response.getcode()
if(rescode==200):
    response_body = response.read()
    result=(response_body.decode('utf-8'))
else:
    print("Error Code:" + rescode)

dic=json.loads(result)
# print(dic)

#번역된 문장만 출력
print(type(dic))
print(dic["message"])
print(dic["message"]["result"]["translatedText"])







