"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from baiduads.api_client import ApiClient, Endpoint as _Endpoint
from baiduads.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from baiduads.cluescore.model.get_clue_result_file_url_request_wrapper import GetClueResultFileUrlRequestWrapper
from baiduads.cluescore.model.get_clue_result_file_url_response_wrapper import GetClueResultFileUrlResponseWrapper
from baiduads.cluescore.model.query_clue_task_status_request_wrapper import QueryClueTaskStatusRequestWrapper
from baiduads.cluescore.model.query_clue_task_status_response_wrapper import QueryClueTaskStatusResponseWrapper
from baiduads.cluescore.model.submit_clue_task_request_wrapper import SubmitClueTaskRequestWrapper
from baiduads.cluescore.model.submit_clue_task_response_wrapper import SubmitClueTaskResponseWrapper


class ClueScoreService(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.get_clue_result_file_url_endpoint = _Endpoint(
            settings={
                'response_type': (GetClueResultFileUrlResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/ClueScoreService/getClueResultFileUrl',
                'operation_id': 'get_clue_result_file_url',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_clue_result_file_url_request_wrapper',
                ],
                'required': [
                    'get_clue_result_file_url_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'get_clue_result_file_url_request_wrapper':
                        (GetClueResultFileUrlRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_clue_result_file_url_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.query_clue_task_status_endpoint = _Endpoint(
            settings={
                'response_type': (QueryClueTaskStatusResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/ClueScoreService/queryClueTaskStatus',
                'operation_id': 'query_clue_task_status',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'query_clue_task_status_request_wrapper',
                ],
                'required': [
                    'query_clue_task_status_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'query_clue_task_status_request_wrapper':
                        (QueryClueTaskStatusRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'query_clue_task_status_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.submit_clue_task_endpoint = _Endpoint(
            settings={
                'response_type': (SubmitClueTaskResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/ClueScoreService/submitClueTask',
                'operation_id': 'submit_clue_task',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'submit_clue_task_request_wrapper',
                ],
                'required': [
                    'submit_clue_task_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'submit_clue_task_request_wrapper':
                        (SubmitClueTaskRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'submit_clue_task_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )

    def get_clue_result_file_url(
        self,
        get_clue_result_file_url_request_wrapper,
        **kwargs
    ):
        """get_clue_result_file_url  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_clue_result_file_url(get_clue_result_file_url_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_clue_result_file_url_request_wrapper (GetClueResultFileUrlRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            GetClueResultFileUrlResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['get_clue_result_file_url_request_wrapper'] = \
            get_clue_result_file_url_request_wrapper
        return self.get_clue_result_file_url_endpoint.call_with_http_info(**kwargs)

    def query_clue_task_status(
        self,
        query_clue_task_status_request_wrapper,
        **kwargs
    ):
        """query_clue_task_status  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.query_clue_task_status(query_clue_task_status_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            query_clue_task_status_request_wrapper (QueryClueTaskStatusRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            QueryClueTaskStatusResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['query_clue_task_status_request_wrapper'] = \
            query_clue_task_status_request_wrapper
        return self.query_clue_task_status_endpoint.call_with_http_info(**kwargs)

    def submit_clue_task(
        self,
        submit_clue_task_request_wrapper,
        **kwargs
    ):
        """submit_clue_task  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.submit_clue_task(submit_clue_task_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            submit_clue_task_request_wrapper (SubmitClueTaskRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            SubmitClueTaskResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['submit_clue_task_request_wrapper'] = \
            submit_clue_task_request_wrapper
        return self.submit_clue_task_endpoint.call_with_http_info(**kwargs)

