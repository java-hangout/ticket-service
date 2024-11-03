#POST http://localhost:8082/api/tickets/
# Request
{
"title": "Required Software",
"description": "Need this software for project deliverables",
"userId": "67271c8076228a729cd80c65",
"status": "Open"
}
# Response 
{
"id": "67272fad354f721dd811854b",
"title": "Required Software",
"description": "Need this software for project deliverables",
"userId": "67271c8076228a729cd80c65",
"status": "Open"
}

# GET http://localhost:8082/api/tickets/67272e562d17e03e4e0a6be5
# NO Request
# Response
{
"id": "67272e562d17e03e4e0a6be5",
"title": "Required Software",
"description": "Need this software for project deliverables",
"userId": "67271c8076228a729cd80c65",
"status": "Open"
}

# GET http://localhost:8082/api/tickets/user/67271c8076228a729cd80c65
# NO Request
# Response
[
{
"id": "67272e562d17e03e4e0a6be5",
"title": "Required Software",
"description": "Need this software for project deliverables",
"userId": "67271c8076228a729cd80c65",
"status": "Open"
},
{
"id": "67272fad354f721dd811854b",
"title": "Required Software",
"description": "Need this software for project deliverables",
"userId": "67271c8076228a729cd80c65",
"status": "Open"
}
]
